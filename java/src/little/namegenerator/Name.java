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

/**
 * A name class that stores gender and different name parts. Supports
 * Formatter/printf formated output of names.
 */
public class Name {

	public enum Gender {
		FEMALE, MALE
	}

	protected Gender gender;
	protected String salutation;
	protected String firstName;
	protected String lastName;
	protected String epithet;

	public Name(Gender gender, String salutation, String firstName, String lastName, String epithet) {
		this.gender = gender;
		this.epithet = epithet;
		this.salutation = salutation;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return "first name"
	 */
	public String getInformal() {
		return format("%f");
	}

	/**
	 * @return "salutation" "last name" "epithet"
	 */
	public String getFormal() {
		return format("%s %l %e");
	}

	/**
	 * @return "salutation" "first name" "last name" "epithet"
	 */
	public String get() {
		return format("%s %f %l %e");
	}

	/**
	 * Creates a string representation of the name based on the given format.
	 * 
	 * Special markers: 
	 * - %s salutation, title or similar (e.g. Captain, Dr.) 
	 * - %f first name 
	 * - %l last name 
	 * - %e epithet, last name or similar (e.g. the Magnificent)
	 * 
	 * Example:
	 * - format = "%f %l, %e
	 * - possible result = "John Doe, the Mild"
	 */
	public String format(String format) {
		String name = "";
		for (int i = 0; i < format.length();) {
			if (!format.startsWith("%", i)) {
				name += format.substring(i, i + 1);
				i++;
				continue;
			}

			int indexCommandEnd = i+2;
			String command = format.substring(i, indexCommandEnd);
			i = indexCommandEnd;

			switch (command) {
			case "%%":
				name += "%";
				break;
			case "%s":
				name += salutation;
				break;
			case "%f":
				name += firstName;
				break;
			case "%l":
				name += lastName;
				break;
			case "%e":
				name += epithet;
				break;
			default:
				throw new IllegalArgumentException("Unknown command for formating a name: " + command);
			}
		}
		return name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEpithet() {
		return epithet;
	}

	public void setEpithet(String epithet) {
		this.epithet = epithet;
	}

}
