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
package little.namegenerator;

import java.util.Random;

import little.namegenerator.Name.Gender;
import little.namegenerator.db.NameDatabase;

/**
 * Simple generator for random names. Generates gender and all name parts
 * uniformly at random. Does not cache returned values from NameDatabase.
 */
public class SimpleRandomNameGenerator {

	protected NameDatabase nameDatabase;
	protected Random random;

	/**
	 * 
	 * @param nameDatabase
	 *            the used name database
	 * @param random
	 *            a Randomizer, e.g. to make the order of produced names
	 *            reproducible
	 */
	public SimpleRandomNameGenerator(NameDatabase nameDatabase, Random random) {
		this.nameDatabase = nameDatabase;
		this.random = random;
	}

	/**
	 * @param nameDatabase
	 *            the used name database
	 */
	public SimpleRandomNameGenerator(NameDatabase nameDatabase) {
		this(nameDatabase, new Random());
	}

	/**
	 * Generates a random name where gender and all name parts are selected
	 * from the NameDatabase uniformly at random.	  
	 */
	public Name generateName() {
		Gender gender = Math.random() >= 0.5 ? Gender.MALE : Gender.FEMALE;
		String salutation = selectRandom(nameDatabase.getSaluations(gender));
		String firstName = selectRandom(nameDatabase.getFirstNames(gender));
		String lastName = selectRandom(nameDatabase.getLastNames(gender));
		String epithet = selectRandom(nameDatabase.getEpithets(gender));
		return new Name(gender, salutation, firstName, lastName, epithet);
	}

	protected String selectRandom(String[] list) {
		int randomIndex = random.nextInt(list.length);
		return list[randomIndex];
	}

}
