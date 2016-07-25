A free collection of name parts to generate fantasy names and a Java
implementation to do so.

# little-namegenerator

This is a small collection of salutations/titles, first names, last 
names and epithets with a focus on the fantasy genre. It also comes 
with a Java implementation to generate random names like

- Wizard Vlad the Dark
- Sorceress Nezquia the Shrewed
- Angel Mai the Mild
- Necromancer Jonhol the Sadist
- Sibyl Uma the Pure
- Pyromancer Ugur the Old
- Scholar Nathan the Pure
- Magician Lewonis the Filthy

# Usage

Some information about how to use these files. If you have any questions,
do not hesitate to ask us!

## Name Parts
The collection contains the following name parts which can be combined
to over 4 million random names:
- 21 male salutations/titles, e.g.
  - Alchemist
  - Magician
  - Warlock
- 8 female salutations/titles, e.g.
  - Angel
  - Hag
  - Witch
- 78 male sounding first names of different origins (Latin, Barbaric, 
Asian, Germanic, etc.), e.g.
    - Aloysius
	- Gmorg
    - Ming-Cheng
	- Waldur
- 78 female sounding first names of different origins, e.g.
    - Arima
	- Mai
	- Quissima
	- Xang-Chi
- 32 last names, e.g. 
    - Alff
	- Levvi
	- Ugmund
	- Zalgrebr
- 58 epithets/bynames, e.g. 
    - the Almighty
	- the Mild
	- the Wise

## Java Implementation
The directory *java* contains an implementation of a name formatter 
(similar to printf) and a random name generator. 

### Example
```java
// Initialize
SimpleRandomNameGenerator gen = new SimpleRandomNameGenerator(new FantasyNameDatabase());

// Generate a random name
Name name = gen.generateName();

// Different String versions of the name
String formatedName = name.format("%s %l, %e");
String informalName = name.getInformal();

// Result
System.out.println("I'm " + formatedName + ", but my friends just call me " + informalName + ".");
//I'm Sorceress Xathraloni the Barbarous, but my friends just call me Mai.
```

### String Formatter 
The Name.format() method supports the following special characters that
are replaced by the corresponding name parts:
- %s salutations/titles/jobs
- %f first names
- %l last names
- %e epithets
- %% a %

All other characters are left in the string, similar to the 
[java.util.Formatter](https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html)
class.

## Txt Files
We also provide the list of names as text files for you to use them
in your own implementation. Just take a look into the *txt* folder.

## License
This project is licensed under the 
[MIT License](https://opensource.org/licenses/MIT). The text files
are also licensed under 
[Creative Commons Attribution 4.0 International](http://creativecommons.org/licenses/by/4.0/).
Use the license that suits your project best. 

When using this projects or parts of it, we ask you to attribute our 
work in the following form on your website, in your credits, etc.:

>**little-namegenerator**
>
>https://github.com/michael-aloys/little-namegenerator
>
>https://www.little-factory-games.com

[![CC Logo](https://i.creativecommons.org/l/by/4.0/80x15.png)](http://creativecommons.org/licenses/by/4.0/)

## TODO
Some improvements that are still in the back of our mind, but which we
have not started implementing. If you are interested in doing so,
pull requests are of course welcome:
- Currently the only attribute is gender. There exist a lot of other
interesting attributes, like origin, good or bad, age, ... A
flexible attribute implementation is needed to create more specific
names.
- More names, other topics (e.g. Sci fy).
- Fancy markov chain name models, like [this](http://www.roguebasin.com/index.php?title=Names_from_a_high_order_Markov_Process_and_a_simplified_Katz_back-off_scheme)
or [that](https://github.com/eigenhombre/namejen). 
