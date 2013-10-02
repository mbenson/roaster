/*
 * Copyright 2012 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.forge.parser.java;

/**
 * Represents a {@link JavaType} that may be declared as belonging to a particular Java {@code package}.
 * 
 * @author <a href="mailto:lincolnbaxter@gmail.com">Lincoln Baxter, III</a>
 * 
 */
public interface Packaged<T>
{
   /**
    * Get the package of this {@link T}, or return null if it is in the default package.
    */
   public String getPackage();

   /**
    * Return whether or not this {@link T} is in the default package.
    */
   public boolean isDefaultPackage();
}
