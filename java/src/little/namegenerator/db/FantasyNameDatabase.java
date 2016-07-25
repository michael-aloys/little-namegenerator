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
 * Collection of name parts with a focus on the
 * fantasy genre. For simplicity, names are
 * stored directly in the code as String arrays.
 */
public class FantasyNameDatabase implements NameDatabase {

	/**
	 * Salutations of male magicians, e.g.
	 * - "Alchemist"
	 * - "Magician"
	 * - "Warlock"
	 * 
	 * Salutations of female magicians, e.g.
	 * - "Angel"
	 * - "Hag"
	 * - "Witch"
	 */
	@Override
	public String[] getSaluations(Gender gender) {
		switch(gender) {
		case MALE:
			return salutationMagicianMale;
		case FEMALE:
		default:
			return salutationMagicianFemale;
		}
	}

	/**
	 * Male-sounding fantasy first names, different origins (e.g.
	 * Latin, Barbaric, Asian, Germanic), e.g.
	 * - Aloysius
	 * - Gmorg
	 * - Ming-Cheng
	 * - Waldur
	 * 
	 * Female-sounding fantasy first names, different origins (e.g 
	 * Latin, English, Asian, Germanic), e.g.
	 * - Arima
	 * - Mai
	 * - Quissima
	 * - Xang-Chi
	 */
	@Override
	public String[] getFirstNames(Gender gender) {
		switch(gender) {
		case MALE:
			return forenamesFantasyMale;
		case FEMALE:
		default:
			return fornamesFantasyFemale;		
		}
	}

	/**
	 * Fantasy last names, gender neutral, different origins (e.g 
	 * Latin, English, Asian, Germanic), e.g.
	 * - Alff
	 * - Levvi
	 * - Ugmund
	 * - Zalgrebr
	 */
	@Override
	public String[] getLastNames(Gender gender) {
		return fantasyLastnames;
	}

	/**
	 * Epithets, gender neutral, not restricted to magicians, e.g.
	 * - the Almighty
	 * - the Mild
	 * - the Wise
	 */
	@Override
	public String[] getEpithets(Gender gender) {
		return epithets;
	}
		
	private static String[] salutationMagicianMale = new String[] {
			"Alchemist",
			"Conjurer",
			"Enchanter",
			"Eunuch",
			"Guardian",
			"Illusionist",
			"Magus",
			"Mage",
			"Magician",
			"Necromancer",
			"Pyromancer",
			"Sage",
			"Scholar",
			"Seer",
			"Shaman",
			"Sorcerer",
			"Summoner",
			"Theurgist",
			"Trickster",
			"Warlock",
			"Wizard",
	};

	private static String[] salutationMagicianFemale = new String[] {
			"Angel",
			"Enchantress",
			"Fairy",
			"Goddess",
			"Hag",	
			"Sibyl",
			"Sorceress",
			"Witch"			
	};

	private static String[] epithets = new String[] {
			"the Almighty",
			"the Adept",
			"the Bald",
			"the Bold",
			"the Brave",
			"the Black",
			"the Barbarous",
			"the Clever",
			"the Chosen",
			"the Cursed",
			"the Cute",
			"the Clumsy",
			"the Dark",
			"the Diplomatic",
			"the Experienced",
			"the Fair",
			"the Fat",
			"the Foresightful",
			"the Filthy",
			"the Gray",
			"the Green",
			"the Handsom",
			"the Hairy",
			"the Holy",
			"the Lucky",
			"the Magical",
			"the Mighty",
			"the Magnanimous",
			"the Mad",
			"the Mild",
			"the Magnificent",
			"the Merciful",
			"the Noble",
			"the Old",
			"the Obscure",
			"the Rich",
			"the Pretty",
			"the Provident",
			"the Pure",
			"the Powerful",
			"the Peaceful",
			"the Sadist",
			"the Sinister",
			"the Simple",
			"the Strong",
			"the Shrewed",
			"the Sodic",
			"the Tall",
			"the Trickser",
			"the Ugly",
			"the Vicious",
			"the Violent",
			"the White",
			"the Wicked",
			"the Wise",
			"the Wild",
			"the Well-Versed",
			"the Young"
	};

	private static String [] forenamesFantasyMale = new String[]{
			"Alwin",
			"Aloysius",
			"Argamon",
			"Bratul",
			"Bolomir",
			"Biir",
			"Crosplong",
			"Citimur",
			"Caered",
			"Drosilvanius",
			"Dolomiti",
			"Drung",
			"Epitar",
			"Elvan",
			"Ertor",
			"Fatoor",
			"Frk",
			"Fitomorogor",
			"Gmorg",
			"Gesugur",
			"Gliyron",
			"Hu-Ku-Mar",
			"Hanomei",
			"Hatori",
			"Ikaar",
			"Io",
			"Ipaqutur",
			"Juvun",
			"Jonhol",
			"Jagan",
			"Jo-Shu Ah",
			"Kkqr",
			"Kolonius",
			"Krataar",
			"Luguto",
			"Lewonis",
			"Larquy",
			"Ma-Hin-Qa",
			"Ming-Cheng",
			"Mogor",
			"Nathan",
			"Nim-Yan",
			"Norg",
			"Plimir",
			"Potohor",
			"Pargori",
			"Quatzalkrak",
			"Quirogor",
			"Quintinivius",
			"Rogok",
			"Rumur",
			"Ratarar",
			"Serpentus",
			"Slag",
			"Sling-Tso",
			"Sebaster",
			"Tutumu-Patava",
			"Tohon",
			"Talesch",
			"Tama-Niru",
			"Ugur",
			"Urmotor",
			"Usalphori",
			"Vlad",
			"Vreeken",
			"Vogon",
			"Waldur",
			"Wismaron",
			"Wuuto",
			"Xang-Zi-Hon",
			"Xak",
			"Xogrok",
			"Yiot",
			"Yong",
			"Yunus",
			"Zaratus",
			"Zlat",
			"Zohor"			
	};

	public static String[] fornamesFantasyFemale = new String[]{
			"Ann",
			"Athala",
			"Arima",
			"Beah",
			"Brimi",
			"Blesa",
			"Closea",
			"Critiha",
			"Cheng-Chi",
			"Drussila",
			"Divina",
			"Dada",
			"Evvi",
			"Elstha",
			"Enga",
			"Fira",
			"Flora",
			"Finasia",
			"Guria",
			"Gelogra",
			"Ganade",
			"Hatdscha",
			"Hithi",
			"Holasa",
			"Insalia",
			"Idda",
			"Ikkanire",
			"Jeng-Cha",
			"Julvegosa",
			"Jowa",
			"Krkga",
			"Kopsozane",
			"Kalissa",
			"Leena",
			"Levelke",
			"Linais",
			"Mai",
			"Madire",
			"Molde",
			"Neziqua",
			"Nelke",
			"Nudsine",
			"Ova",
			"Otgaegh",
			"Ong-Ma",
			"Paxinra",
			"Plynluvia",
			"Polail",
			"Qua-Quae",
			"Quissima",
			"Quofa",
			"Ramta",
			"Romanne",
			"Rawalde",
			"Schwimawa",
			"Soosta",
			"Singa",
			"Tulipa",
			"Tai",
			"Tuzire",
			"Uma",
			"Ullisa",
			"Uosin",
			"Valhala",
			"Vaegh",
			"Vima",
			"Worane",
			"Wgingai",
			"Wapsa",
			"Xang-Chi",
			"Xussima",
			"Xolail",
			"Yumi",
			"Yana",
			"Yosra",
			"Zara",
			"Zalaise",
			"Zumida"
	};

	public static String[] fantasyLastnames = new String[] {
			"Alff",
			"Avonson",
			"Amurin",
			"Bogothan",
			"Blisund",
			"Brom",
			"Chalu",
			"Ding",
			"Evri",
			"Gumki",
			"Gong-Gong",
			"Hodoron",
			"Huck",
			"Ingkra",
			"Jim",
			"Kasartha",
			"Levvi",
			"Meltcher",
			"Nosri",
			"Pagund",
			"Questalbrak",
			"Ravigi",
			"Saliman",
			"Tu",
			"Ugmund",
			"Valesi",
			"Van Tahl",
			"Wong",
			"Wrimon",
			"Xathraloni",
			"Yussu",
			"Zalgrebr"
	};
}
