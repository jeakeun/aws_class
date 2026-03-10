package kr.hi.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true) // 👈 API 응답에 모르는 필드가 있어도 무시함 (핵심)
public class TourItemDto {
    private String areaCode;
    private String areaNm;
    private String touDivNm;
    private String touNum;
    private String baseYmd;
}