/*
 * RCompletionType.java
 *
 * Copyright (C) 2014 by RStudio, Inc.
 *
 * Unless you have received this program directly from RStudio pursuant
 * to the terms of a commercial license agreement with RStudio, then
 * this program is licensed to you under the terms of version 3 of the
 * GNU Affero General Public License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * AGPL (http://www.gnu.org/licenses/agpl-3.0.txt) for more details.
 *
 */
package org.rstudio.studio.client.common.codetools;

public class RCompletionType
{
   public static final int UNKNOWN = 0;
   public static final int VECTOR = 1;
   public static final int FUNCTION = 2;
   public static final int ARGUMENTS = 3;
   public static final int DATAFRAME = 4;
   public static final int LIST = 5;
   public static final int ENVIRONMENT = 6;
   public static final int S4 = 7;
   public static final int REFERENCE_CLASS = 8;
   public static final int FILE = 9;
   public static final int CHUNK = 10;
   public static final int ROXYGEN = 11;
   public static final int HELP = 12;
   public static final int STRING = 13;
   public static final int PACKAGE = 14;
   public static final int KEYWORD = 15;

}