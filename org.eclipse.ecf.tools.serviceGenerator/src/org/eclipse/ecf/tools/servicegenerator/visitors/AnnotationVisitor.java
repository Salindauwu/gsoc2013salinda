/*******************************************************************************
* Copyright (c) 2013 Composent, Inc. and others. All rights reserved. This
* program and the accompanying materials are made available under the terms of
* the Eclipse Public License v1.0 which accompanies this distribution, and is
* available at http://www.eclipse.org/legal/epl-v10.html
*
******************************************************************************/
package org.eclipse.ecf.tools.servicegenerator.visitors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.NormalAnnotation;

public class AnnotationVisitor extends ASTVisitor {
        List<MarkerAnnotation> annotations = new ArrayList<MarkerAnnotation>();
        List<NormalAnnotation> normalAnnotations=new ArrayList<NormalAnnotation>();
       
        @Override
        public boolean visit(MarkerAnnotation node) {
               
                annotations.add(node);
                return super.visit(node);
        }
       
        @Override
        public boolean visit(NormalAnnotation node) {
               
                normalAnnotations.add(node);
                return super.visit(node);
        }
       
        /**
         *
         * @return
         */
        public List<MarkerAnnotation> getAnnotations() {
                return annotations;
        }
       
        public List<NormalAnnotation> getNormalAnnotations() {
                return normalAnnotations;
        }
}
