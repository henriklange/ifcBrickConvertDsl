/**
 * generated by Xtext 2.12.0
 */
package org.xtext.ifcbrickconvert.ifcBrick;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getEid <em>Eid</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getE <em>E</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getAc <em>Ac</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getU <em>U</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getS <em>S</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getI <em>I</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getD <em>D</em>}</li>
 *   <li>{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getN <em>N</em>}</li>
 * </ul>
 *
 * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>X</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>X</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>X</em>' attribute.
   * @see #setX(String)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_X()
   * @model
   * @generated
   */
  String getX();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getX <em>X</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>X</em>' attribute.
   * @see #getX()
   * @generated
   */
  void setX(String value);

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
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_Eid()
   * @model containment="true"
   * @generated
   */
  EntId getEid();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getEid <em>Eid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eid</em>' containment reference.
   * @see #getEid()
   * @generated
   */
  void setEid(EntId value);

  /**
   * Returns the value of the '<em><b>C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' containment reference.
   * @see #setC(CSV)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_C()
   * @model containment="true"
   * @generated
   */
  CSV getC();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getC <em>C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' containment reference.
   * @see #getC()
   * @generated
   */
  void setC(CSV value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference.
   * @see #setE(Entity)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_E()
   * @model containment="true"
   * @generated
   */
  Entity getE();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getE <em>E</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>E</em>' containment reference.
   * @see #getE()
   * @generated
   */
  void setE(Entity value);

  /**
   * Returns the value of the '<em><b>Ac</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ac</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ac</em>' containment reference.
   * @see #setAc(AttributeCollection)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_Ac()
   * @model containment="true"
   * @generated
   */
  AttributeCollection getAc();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getAc <em>Ac</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ac</em>' containment reference.
   * @see #getAc()
   * @generated
   */
  void setAc(AttributeCollection value);

  /**
   * Returns the value of the '<em><b>U</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>U</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>U</em>' attribute.
   * @see #setU(String)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_U()
   * @model
   * @generated
   */
  String getU();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getU <em>U</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>U</em>' attribute.
   * @see #getU()
   * @generated
   */
  void setU(String value);

  /**
   * Returns the value of the '<em><b>S</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' attribute.
   * @see #setS(String)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_S()
   * @model
   * @generated
   */
  String getS();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getS <em>S</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' attribute.
   * @see #getS()
   * @generated
   */
  void setS(String value);

  /**
   * Returns the value of the '<em><b>I</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>I</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>I</em>' attribute.
   * @see #setI(int)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_I()
   * @model
   * @generated
   */
  int getI();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getI <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>I</em>' attribute.
   * @see #getI()
   * @generated
   */
  void setI(int value);

  /**
   * Returns the value of the '<em><b>D</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>D</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>D</em>' attribute.
   * @see #setD(String)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_D()
   * @model
   * @generated
   */
  String getD();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getD <em>D</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>D</em>' attribute.
   * @see #getD()
   * @generated
   */
  void setD(String value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(String)
   * @see org.xtext.ifcbrickconvert.ifcBrick.IfcBrickPackage#getAttribute_N()
   * @model
   * @generated
   */
  String getN();

  /**
   * Sets the value of the '{@link org.xtext.ifcbrickconvert.ifcBrick.Attribute#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(String value);

} // Attribute