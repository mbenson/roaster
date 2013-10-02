/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.parser.java;

import org.jboss.forge.parser.Internal;

/**
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public interface ReadImport extends Internal
{
   public String getPackage();

   public String getSimpleName();

   public String getQualifiedName();

   public boolean isStatic();

   public boolean isWildcard();

   public interface Import extends ReadImport
   {
      public Import setName(final String name);

      public Import setStatic(final boolean value);
   }
}