/**
 * Copyright (c) 2016 Jonas Förster & Michael A. Hedderich
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package little.namegenerator.db;

import little.namegenerator.Name.Gender;

/**
 * Simple interface for a name database. 
 * Implementations return all available 
 * options for the given name part.
 */
public interface NameDatabase {

	/**
	 * Salutations, titles or similar, 
	 * placed before the name, e.g.
	 * - Captain 
	 * - Dr. 
	 * 
	 * @param gender the gender of the person
	 * @return an array of possible salutations
	 */
	public String[] getSaluations(Gender gender);
	
	/**
	 * First names / forenames / given names
	 * @param gender the gender of the person
	 * @return an array of possible first names
	 */
	public String[] getFirstNames(Gender gender);
	
	/**
	 * Last names / family names / surnames 
	 * @param gender the gender of the person
	 * @return an array of possible last names
	 */
	public String[] getLastNames(Gender gender);
	
	/**
	 * Epithets, bynames or similar, placed after the name,
	 * e.g. the Great
	 * 
	 * @param gender the gender of the person
	 * @return an array of possible epithets
	 */
	public String[] getEpithets(Gender gender);
	
}
