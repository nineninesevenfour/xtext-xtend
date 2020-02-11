/**
 * Copyright (c) 2017 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtend.core.tests.compiler;

import org.eclipse.xtend.core.tests.compiler.AbstractXtendCompilerTest;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.junit.Test;

/**
 * Tests for <a href="https://bugs.eclipse.org/bugs/show_bug.cgi?id=516321">https://bugs.eclipse.org/bugs/show_bug.cgi?id=516321</a>
 * 
 * @author Christian Dietrich - Initial contribution and API
 */
@SuppressWarnings("all")
public class CompilerBug516321Test extends AbstractXtendCompilerTest {
  @Test
  public void testBug516321() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.example.xtend.arraylist");
    _builder.newLine();
    _builder.newLine();
    _builder.append("class ArrayListCompile {");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String foo() {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("bar(");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("newArrayList(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("), newArrayList(");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz,");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("\'x\'.baz, \'x\'.baz, \'x\'.baz");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("))");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String bar(Iterable<String> a, Iterable<String> b) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String baz(String foo) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return \'\'\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package com.example.xtend.arraylist;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import org.eclipse.xtext.xbase.lib.CollectionLiterals;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("@SuppressWarnings(\"all\")");
    _builder_1.newLine();
    _builder_1.append("public class ArrayListCompile {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String foo() {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return this.bar(");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("CollectionLiterals.<String>newArrayList(");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("        ");
    _builder_1.append("this.baz(\"x\")), CollectionLiterals.<String>newArrayList(");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\"), ");
    _builder_1.newLine();
    _builder_1.append("      ");
    _builder_1.append("this.baz(\"x\"), this.baz(\"x\"), this.baz(\"x\")));");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String bar(final Iterable<String> a, final Iterable<String> b) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return null;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("public String baz(final String foo) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("return \"\";");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    this.assertCompilesTo(_builder, _builder_1);
  }
}
