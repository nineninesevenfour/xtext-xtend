/**
 * Copyright (c) 2015, 2016 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtend.core.tests.java8.compiler;

import org.eclipse.xtend.core.tests.compiler.AbstractXtendCompilerTest;
import org.eclipse.xtend.core.tests.java8.Java8RuntimeInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 * @author Miro Spoenemann - Copied and adapted to Java 8 output
 */
@InjectWith(Java8RuntimeInjectorProvider.class)
@SuppressWarnings("all")
public class CompilerBug457333Test extends AbstractXtendCompilerTest {
  @Test
  public void test_01() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.Map");
    _builder.newLine();
    _builder.append("import org.eclipse.xtext.xbase.lib.Functions.Function0");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class XtendPlugin implements (String)=>void {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("override apply(String project) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("#[\'\'].forEach [ sourceSet |");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("create(\'\', Object) [");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("conventionMapping(");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("#{");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\"classpath\" -> [|sourceSet.charAt(0)],");
    _builder.newLine();
    _builder.append("\t\t\t\t\t\t");
    _builder.append("\"bootClasspath\" -> [|sourceSet.charAt(0)]");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("})");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("static def void conventionMapping(Object task, Map<String, ? extends Function0<?>> mappings) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def <T> void create(String s, Class<? extends T> c, Action<? super T> a) {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def <T> void all(Action<T> action) {}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("interface Action<T> {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("def void exec(T t)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("import java.util.Collections;");
    _builder_1.newLine();
    _builder_1.append("import java.util.Map;");
    _builder_1.newLine();
    _builder_1.append("import java.util.function.Consumer;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.CollectionLiterals;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Functions.Function0;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Pair;");
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class XtendPlugin implements Procedure1<String> {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public interface Action<T extends Object> {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("void exec(final T t);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("@Override");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public void apply(final String project) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("final Consumer<String> _function = (String sourceSet) -> {");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("final XtendPlugin.Action<Object> _function_1 = (Object it) -> {");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("final Function0<Character> _function_2 = () -> {");
    _builder_1.newLine();
    _builder_1.append("          ");
    _builder_1.append("return Character.valueOf(sourceSet.charAt(0));");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("Pair<String, Function0<Character>> _mappedTo = Pair.<String, Function0<Character>>of(\"classpath\", _function_2);");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("final Function0<Character> _function_3 = () -> {");
    _builder_1.newLine();
    _builder_1.append("          ");
    _builder_1.append("return Character.valueOf(sourceSet.charAt(0));");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("Pair<String, Function0<Character>> _mappedTo_1 = Pair.<String, Function0<Character>>of(\"bootClasspath\", _function_3);");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("XtendPlugin.conventionMapping(it, ");
    _builder_1.newLine();
    _builder_1.append("          ");
    _builder_1.append("Collections.<String, Function0<Character>>unmodifiableMap(CollectionLiterals.<String, Function0<Character>>newHashMap(_mappedTo, _mappedTo_1)));");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.<Object>create(\"\", Object.class, _function_1);");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("};");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(\"\")).forEach(_function);");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public static void conventionMapping(final Object task, final Map<String, ? extends Function0<?>> mappings) {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public <T extends Object> void create(final String s, final Class<? extends T> c, final XtendPlugin.Action<? super T> a) {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public <T extends Object> void all(final XtendPlugin.Action<T> action) {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }
}
