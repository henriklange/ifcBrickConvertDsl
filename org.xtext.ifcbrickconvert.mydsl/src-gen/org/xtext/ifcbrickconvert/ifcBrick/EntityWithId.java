/**
 * generated by Xtext 2.12.0
 */
package org.xtext.ifcbrickconvert.ifcBrick;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity With Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.EntityWithId#getEid <em>Eid</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.EntityWithId#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getEntityWithId()
 * @model
 * @generated
 */
public interface EntityWithId extends EObject
{
  /**
   * Returns the value of the '<em><b>Eid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Eid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eid</em>' containment reference.
   * @see #setEid(EntId)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getEntityWithId_Eid()
   * @model containment="true"
   * @generated
   */
  EntId getEid();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.EntityWithId#getEid <em>Eid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eid</em>' containment reference.
   * @see #getEid()
   * @generated
   */
  void setEid(EntId value);

  /**
   * Returns the value of the '<em><b>Entity</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity</em>' containment reference.
   * @see #setEntity(Entity)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getEntityWithId_Entity()
   * @model containment="true"
   * @generated
   */
  Entity getEntity();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.EntityWithId#getEntity <em>Entity</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity</em>' containment reference.
   * @see #getEntity()
   * @generated
   */
  void setEntity(Entity value);

} // EntityWithId