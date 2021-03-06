/*
 * generated by Xtext 2.12.0
 */
package org.xtext.ifcbrickconvert.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.xtext.ifcbrickconvert.ifcBrick.Root
import org.xtext.ifcbrickconvert.ifcBrick.Entity
import org.xtext.ifcbrickconvert.ifcBrick.EntityTerminated
import org.xtext.ifcbrickconvert.ifcBrick.EntityWithId
import org.xtext.ifcbrickconvert.ifcBrick.AttributeCollection
import org.xtext.ifcbrickconvert.ifcBrick.Attribute
import org.xtext.ifcbrickconvert.ifcBrick.Data
import java.util.HashMap

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class IfcBrickGenerator extends AbstractGenerator {

	HashMap<Integer, String> buildings = new HashMap();
	HashMap<Integer, String> floors = new HashMap();
	HashMap<Integer, String> rooms = new HashMap();
	HashMap<Integer, AttributeCollection> relaggregates = new HashMap();

	HashMap<Integer, String> roofs = new HashMap();
	HashMap<Integer, String> zones = new HashMap();
	HashMap<Integer, String> usedZones = new HashMap();
	HashMap<Integer, AttributeCollection> relAssignsToGroups = new HashMap();
	
	HashMap<Integer, Integer> roomsInZones = newHashMap();

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val data = resource.allContents.filter(Root).head.data;
		extractElements(data);
		
		fsa.generateFile(
			resource.URI.lastSegment.replace(".ifc", ".ttl"), 
			data.generateData
		);	
		resource.allContents.filter(typeof(Root));
		
	}

	def extractElements(Data data){
		buildings.clear();
		floors.clear();
		rooms.clear();
		relaggregates.clear();
		
		roofs.clear();
		zones.clear();
		usedZones.clear();
		relAssignsToGroups.clear();
		
		roomsInZones.clear();
		
		setContinuator("");
		
		for(EntityWithId ewi : data.entityWithIds){
			
			switch ewi.entity.definition.toLowerCase() {
				case 'ifcbuilding':
					buildings.put(
						ewi.eid.id, 
						"building" + ewi.eid.id)
				
				case 'ifcbuildingstorey':
					floors.put(
						ewi.eid.id, 
						ewi.entity.attributeCollection.attributes.get(2).s
						.replace("'", "")
						.replace(" ", "_")
						.replace(":", "_"))
						
				case 'ifcspace':
					rooms.put(
						ewi.eid.id, 
						(ewi.entity.attributeCollection.attributes.get(7).s
						+ ewi.entity.attributeCollection.attributes.get(2).s)
						.replace("'", "")
						.replace(" ", "_")
						.replace(":", "_"))
				
				case 'ifcrelaggregates':
					relaggregates.put(
						ewi.entity.attributeCollection.attributes.get(4).eid.id,
						ewi.entity.attributeCollection.attributes.get(5).ac)
				
				case 'ifcroof':
					roofs.put(ewi.eid.id, "roof" + ewi.eid.id)
					
				case 'ifcgroup':
					zones.put(ewi.eid.id, "zone" + ewi.eid.id)
				case 'ifczone':
					zones.put(ewi.eid.id, "zone" + ewi.eid.id)
				case 'ifcrelassignstogroup':
					relAssignsToGroups.put(
						ewi.entity.attributeCollection.attributes.get(6).eid.id,
						ewi.entity.attributeCollection.attributes.get(4).ac)
				
			}
			
			//enables room lookup for groups/zones
			for(zone: zones.keySet()){
				if(relAssignsToGroups.containsKey(zone)){
					for(room: relAssignsToGroups.get(zone).attributes){
						if(rooms.containsKey(room.eid.id)){
							roomsInZones.put(room.eid.id, zone);
							if(!usedZones.containsKey(zone)){
								usedZones.put(zone, zones.get(zone));
							}
						}
					}
				}
			}
			
			
		}
	}
	
	String continuator = "";
	// "" = false, " " = true
	
	def setContinuator(String c){
		this.continuator = c;
	}
	
	def getContinuator(){
		if(continuator.equals("")){
			return false;
		} else {
			return true;
		}
	}
	
	def CharSequence generateData(Data data)'''
	@prefix bf: <https://brickschema.org/schema/1.0.1/BrickFrame#> .
	@prefix bldg: <http://buildsys.org/ontologies/bldg#> .
	@prefix brick: <https://brickschema.org/schema/1.0.1/Brick#> .
	@prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
	@prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#> .
	@prefix xml: <http://www.w3.org/XML/1998/namespace> .
	@prefix xsd: <http://www.w3.org/2001/XMLSchema#> .
	
	«FOR building: buildings.keySet()»
		bldg:«buildings.get(building)» a brick:Building «
			IF relaggregates.containsKey(building)»«
			FOR rel: relaggregates.get(building).attributes»«
				IF floors.containsKey(rel.eid.id)»«
					IF getContinuator()» ,
					
					bldg:«floors.get(rel.eid.id)»«
					ELSE» ;
				bf:hasPart bldg:«floors.get(rel.eid.id)»«
				setContinuator(" ")»«
					ENDIF»«
				ENDIF»«
			ENDFOR»«
			ENDIF» .«
			setContinuator("")»
	«ENDFOR»
	
	«FOR floor: floors.keySet()»
		bldg:«floors.get(floor)» a brick:Floor «
		IF relaggregates.containsKey(floor)»«
		FOR rel: relaggregates.get(floor).attributes»«
			IF rooms.containsKey(rel.eid.id)»«
				IF getContinuator()» ,
				bldg:«rooms.get(rel.eid.id)»«
				ELSE»;
			bf:hasPart bldg:«rooms.get(rel.eid.id)»«
				setContinuator(" ")»«
				ENDIF»«
			ENDIF»«
		ENDFOR»«
		ENDIF» .
		«setContinuator("")»
	«ENDFOR»
	
	«FOR zone: usedZones.keySet()»
		bldg:«usedZones.get(zone)» a brick:HVAC_Zone
	«ENDFOR»
	
	«FOR room: rooms.keySet()»
		bldg:«rooms.get(room)» a brick:Room«
		IF roomsInZones.containsKey(room)» ;
			bf:isPartOf bldg:«zones.get(roomsInZones.get(room))»«
		ENDIF» .
		
	«ENDFOR»
	
	«FOR roof: roofs.keySet()»
		bldg:«roofs.get(roof)» a brick:Roof .
	«ENDFOR»
	
	'''	
	
}


/*  buildings: «buildings.size()»
	floors: «floors.size()»
	rooms: «rooms.size()»
	relaggregates: «relaggregates.size()»
	roofs: «roofs.size()»
	zones: «zones.size()»
	used zones: «usedZones.size()»
	relassignstogroups: «relAssignsToGroups.size()»
	hvac zones: «roomsInZones.size()»
	
 */