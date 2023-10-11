package at.fhtw.be_webeng_23ws.service;


import at.fhtw.be_webeng_23ws.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    public static Stream<Arguments> provideYearsAndExpectedEras(){
        return Stream.of(
                Arguments.of("19th century or before", 1899),
                Arguments.of("20th century", 1999),
                Arguments.of("21st century", 2099)
        );
    }

    @Test
    void getEra_returns19thCentury() {
        //given when then
        //arrange act assert

        //Given/Arrange
        int year = 1899;

        //When/Act
        String actualEra = bookService.getEra(year);

        //Then/Assert
        assertEquals("19th century or before", actualEra);
    }
    @Test
    void getEra_returns20thCentury() {
        //Given/Arrange
        int year = 1999;
        //When/Act
        String actualEra = bookService.getEra(year);
        //Then/Assert
        assertEquals("20th century", actualEra);
    }
    @ParameterizedTest
    @MethodSource("provideYearsAndExpectedEras")
    void getEra_returnsCenturyText(String expectedEra, int year) {
        String actualEra = bookService.getEra(year);
        assertEquals(expectedEra, actualEra);
    }
    @Test
    void getEra_receivesInvalidYear_throwsIllegalArgumentException() {
        //Given/Arrange
        int year = 9999;
        //When/Act
        assertThrows(IllegalArgumentException.class, () -> bookService.getEra(year));
    }

}