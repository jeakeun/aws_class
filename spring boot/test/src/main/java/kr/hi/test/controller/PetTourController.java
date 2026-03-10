package kr.hi.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.hi.test.entity.PetTourEntity;
import kr.hi.test.repository.PetTourRepository;
import kr.hi.test.service.PetTourService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class PetTourController {

    private final PetTourService petTourService;
    private final PetTourRepository repository;

    /**
     * 1️⃣ 공공데이터 저장 + 화면 이동
     * 브라우저에서:
     * http://localhost:8080/pet/save
     */
    @GetMapping("/pet/save")
    public String saveAndGoList() {
        petTourService.savePetTourData();
        return "redirect:/pet-tour";
    }

    /**
     * 2️⃣ 전체 목록 화면
     * http://localhost:8080/pet-tour
     */
    @GetMapping("/pet-tour")
    public String list(Model model) {
        List<PetTourEntity> list = repository.findAll();
        model.addAttribute("list", list);
        return "pet/list";   // templates/pet/list.html
    }

    /**
     * 3️⃣ 지역별 조회 화면
     * http://localhost:8080/pet-tour/area?areaCode=1
     */
    @GetMapping("/pet-tour/area")
    public String byArea(@RequestParam String areaCode, Model model) {
        List<PetTourEntity> list = repository.findByAreaCode(areaCode);
        model.addAttribute("list", list);
        return "pet/list";
    }

    /**
     * 4️⃣ (선택) API 테스트용 – 화면 이동 없음
     * http://localhost:8080/api/pet/save
     */
    @ResponseBody
    @GetMapping("/api/pet/save")
    public String saveApiOnly() {
        petTourService.savePetTourData();
        return "ok";
    }
}
