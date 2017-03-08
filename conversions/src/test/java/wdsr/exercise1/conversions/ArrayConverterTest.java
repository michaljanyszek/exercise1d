package wdsr.exercise1.conversions;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 *
 * @author michal
 */
public class ArrayConverterTest {
    
    public ArrayConverterTest() {
    }
    private ArrayConverter converter;
    
    @Before
    public void setup() {
        converter = new ArrayConverter();
    }
    
    @Test
    public void testShouldReturnArrayOfInt() {
        // given
        String[] args = {"2", "3", "5"};
        
        // when
        int[] result = converter.convertToInts(args);
        
        // then
        assertThat(result[0], is(2));
        assertThat(result[1], is(3));
        assertThat(result[2], is(5));
    }
    
    @Test(expected=NullPointerException.class)
    public void testShouldRaiseNullPointerException(){
        // given
        String[] args = null;
        
        //when
        converter.convertToInts(args);
        //then
        //empty
    }
    
    @Test(expected=NumberFormatException.class)
    public void testShouldRaiseNumberFormatException() {
        //given
        String[] args = new String[] {"nie"};
        
        //when
        converter.convertToInts(args);
        
        //then
        //empty
    }
    
}
