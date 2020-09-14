import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
//        1.
//        Given String is null
//        When convert
//        Then return null
//
//        2.
//        Given String no repeat vowels
//        When convert
//        Then return itself
//
//        3.
//        Given String of length of 1
//        When convert
//        Then return itself
//
//        4.
//        Given String repeat vowels less than 30%
//        When convert
//        Then return itself
//
//        5.
//        Given String repeat vowels more than 30% and repeat vowels
//        When convert
//        Then return string inserted mommy

public class MommifierTest {
    @Test
    void should_return_null_when_given_null(){
            Mommifier mommifier=new Mommifier();
            String undefine=null;
            String result =mommifier.convert(undefine);
            assertEquals(null,result);
    }
    @Test
    void should_return_itself_if_given_no_repeat_vowels(){
            Mommifier mommifier=new Mommifier();
            String no_repeat_vowels="aba";
            String result =mommifier.convert(no_repeat_vowels);
            assertEquals("aba",result);
    }
    @Test
    void should_return_itself_when_given_one_char(){
        Mommifier mommifier=new Mommifier();
        String one_char="a";
        String result =mommifier.convert(one_char);
        assertEquals("a",result);
    }
    @Test
    void should_return_itself_if_given_less_than_30(){
        Mommifier mommifier=new Mommifier();
        String less_than_30="aaabbbbbbbbbbbbbbbbb";
        String result =mommifier.convert(less_than_30);
        assertEquals("aaabbbbbbbbbbbbbbbbb",result);
    }
    @Test
    void should_return_insert_mommy_if_given_no_repeat_vowels_and_more_than_30(){
        Mommifier mommifier=new Mommifier();
        String more_than_30_repeated="aaabaaa";
        String result =mommifier.convert(more_than_30_repeated);
        assertEquals("amommyamommyabamommyamommya",result);
    }
}
