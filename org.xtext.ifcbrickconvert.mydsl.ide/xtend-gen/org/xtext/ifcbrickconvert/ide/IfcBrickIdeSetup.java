/**
 * generated by Xtext 2.12.0
 */
package org.xtext.ifcbrickconvert.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.ifcbrickconvert.IfcBrickRuntimeModule;
import org.xtext.ifcbrickconvert.IfcBrickStandaloneSetup;
import org.xtext.ifcbrickconvert.ide.IfcBrickIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class IfcBrickIdeSetup extends IfcBrickStandaloneSetup {
  @Override
  public Injector createInjector() {
    IfcBrickRuntimeModule _ifcBrickRuntimeModule = new IfcBrickRuntimeModule();
    IfcBrickIdeModule _ifcBrickIdeModule = new IfcBrickIdeModule();
    return Guice.createInjector(Modules2.mixin(_ifcBrickRuntimeModule, _ifcBrickIdeModule));
  }
}
