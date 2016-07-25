package little.namegenerator;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import little.namegenerator.Name.Gender;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class NameTest {

	@Parameterized.Parameters
	public static Collection<Object[]> namesFormatsAndFormattedNames() {
		return Arrays.asList(new Object[][] { 
			// Simple example
			{new Name(Gender.MALE, "Dr.", "Ac", "Ula", "the Dark"), "%s %f %l %e", "Dr. Ac Ula the Dark" },
			// Only subset of possible elements
			{new Name(Gender.FEMALE, "Aunt", "Polly", "Twain", "the Mild"), "%s %f", "Aunt Polly"},
			// No space between two elements
			{new Name(Gender.FEMALE, "Miss", "He", "Lena", "the Beautiful"), "%s %f%l %e", "Miss HeLena the Beautiful"}, 
			// Additional characters
			{new Name(Gender.MALE, "Prof.", "Ludwig", "Wittgenstein", "the Thinker"), "%l, %s %f (%e)", "Wittgenstein, Prof. Ludwig (the Thinker)"},
			// Additional character that is also formatter
			{new Name(Gender.MALE, "Mr.", "Ace", "Wal", "the Ingenious"), "%ll %f", "Wall Ace"},
			// %% as additional character
			{new Name(Gender.FEMALE, "Miss", "Jane", "Austen", "the Eloquent"), "%%%f %l%%", "%Jane Austen%"}
		});
	}
	
	@Parameter(value=0)
	public Name name;
	
	@Parameter(value=1)
	public String format;
	
	@Parameter(value=2)
	public String formatedOutput;
	
	
	@Test
	public void givenName_whenCreatingFormattedString_thenOutputCorrect() {
		assertEquals(name.format(format),formatedOutput);
	}

}
