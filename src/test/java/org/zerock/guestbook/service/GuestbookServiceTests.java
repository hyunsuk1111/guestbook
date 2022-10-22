package org.zerock.guestbook.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.guestbook.dto.GuestbookDTO;

@SpringBootTest
public class GuestbookServiceTests {

    @Autowired
    private GuestbookServiceImpl service;

    @Test
    @DisplayName("등록 테스트")
    public void testRegister(){
        GuestbookDTO guestbookDTO = GuestbookDTO.builder()
                .title("Sample Title")
                .content("Sample Content")
                .writer("user0")
                .build();

        System.out.println(service.register(guestbookDTO));
    }
}
