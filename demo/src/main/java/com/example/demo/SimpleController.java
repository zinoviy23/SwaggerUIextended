package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("a/")
public class SimpleController {
    @RequestMapping(value = "1", method = {RequestMethod.GET, RequestMethod.POST})
    String a1() {
        return "";
    }

    @GetMapping("/2")
    String a2() {
        return "";
    }

    @GetMapping("/3/*")
    String a3() {
        return "";
    }

    @GetMapping("/4")
    String a4() {
        return "";
    }

    @GetMapping("/5#")
    String a5() {
        return "";
    }

    @GetMapping("/6")
    String a6() {
        return "";
    }

    @GetMapping("/7")
    String a7() {
        return "";
    }

    @GetMapping("/8")
    String a8() {
        return "";
    }

    @GetMapping("/9")
    String a9() {
        return "";
    }

    @GetMapping("/10")
    String a10() {
        return "";
    }

    @GetMapping("/11")
    String a11() {
        return "";
    }

    @GetMapping("/12")
    String a12() {
        return "";
    }

    @GetMapping("/13")
    String a13() {
        return "";
    }

    @GetMapping("/14")
    String a14() {
        return "";
    }

    @GetMapping("/15")
    String a15() {
        return "";
    }

    @GetMapping("/16")
    String a16() {
        return "";
    }

    @GetMapping("/17")
    String a17() {
        return "";
    }

    @GetMapping("/18")
    String a18() {
        return "";
    }

    @GetMapping("/19")
    String a19() {
        return "";
    }

    @GetMapping("/21")
    String a21() {
        return "";
    }

    @GetMapping("/22")
    String a22() {
        return "";
    }

    @GetMapping("/23")
    String a23() {
        return "";
    }

    @GetMapping("/24")
    String a24() {
        return "";
    }

    @GetMapping("/25")
    String a25() {
        return "";
    }

    @GetMapping("/26")
    String a26() {
        return "";
    }

    @GetMapping("/27")
    String a27() {
        return "";
    }

    @GetMapping("/28")
    String a28() {
        return "";
    }

    @GetMapping("/29")
    String a29() {
        return "";
    }

    @GetMapping("/30")
    String a30() {
        return "";
    }

    @GetMapping("/31")
    String a31() {
        return "";
    }

    @GetMapping("/32")
    String a32() {
        return "";
    }

    @GetMapping("/33")
    String a33() {
        return "";
    }

    @GetMapping
    String a34() {
        return "";
    }
}
