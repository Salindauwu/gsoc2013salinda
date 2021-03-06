/*******************************************************************************
* Copyright (c) 2013 Salinda Jayawardana. All rights reserved. This
* program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0 which accompanies this distribution, and is
* available at http://www.eclipse.org/legal/epl-v10.html
*
******************************************************************************/
package org.eclipse.ecf.tools.serviceGenerator.visitors;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;


public class MethodVisitor extends ASTVisitor {
        List<MethodDeclaration> methods = new ArrayList<MethodDeclaration>();

        @Override
        public boolean visit(MethodDeclaration node) {
                methods.add(node);
                return super.visit(node);
        }
       
        public List<MethodDeclaration> getMethods() {
                return methods;
        }  
}
