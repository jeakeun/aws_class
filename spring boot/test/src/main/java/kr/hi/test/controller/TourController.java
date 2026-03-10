package kr.hi.test.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import kr.hi.test.TourItemDto;
import kr.hi.test.service.TourService;

/**
 * 관광 데이터를 처리하는 컨트롤러
 */
@RestController
@RequestMapping("/api/tour")
@CrossOrigin(origins = "*") // 리액트와의 통신(CORS) 허용
public class TourController {

    private final TourService tourService;

    // 생성자 주입
    public TourController(TourService tourService) {
        this.tourService = tourService;
    }

    /**
     * 관광 빅데이터 통계 조회 API
     * 에러 해결 포인트: @RequestParam에 명시적으로 이름을 작성함 (value = "...")
     */
    @GetMapping("/stats")
    public List<TourItemDto> getStats(
            @RequestParam(value = "areaCode", required = false, defaultValue = "11") String areaCode,
            @RequestParam(value = "startYmd", required = false) String startYmd,
            @RequestParam(value = "endYmd", required = false) String endYmd) {
        
        return tourService.getBigDataStats(areaCode, startYmd, endYmd);
    }
}