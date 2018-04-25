/**
 * generated by Xtext 2.12.0
 */
package org.xtext.ifcbrickconvert.ifcBrick;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Data#getEntityWithIds <em>Entity With Ids</em>}</li>
 * </ul>
 *
 * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity With Ids</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ifcbrickconvert.ifcBrick.EntityWithId}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity With Ids</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity With Ids</em>' containment reference list.
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getData_EntityWithIds()
   * @model containment="true"
   * @generated
   */
  EList<EntityWithId> getEntityWithIds();

} // Data
