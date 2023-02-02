package shop.mtcoding.ajax.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ResponseDto<T> {
    private int code; // 1, -1
    private String msg; // 상세사유
    private T data;
    // response는 항상 어떤 요청이든 body 데이터가 있다
    // response 해줄 때 무조건 Object로 해주자
    // 제너릭은 new 할 때 타입이 결정이 된다.
}
