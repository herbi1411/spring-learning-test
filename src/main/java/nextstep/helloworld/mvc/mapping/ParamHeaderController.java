package nextstep.helloworld.mvc.mapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {

    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok().body("message");
    }

    @GetMapping(value = "/message", params = "name")
    public ResponseEntity<String> messageForParam(String name) {
        return ResponseEntity.ok().body(name);
    }

    @GetMapping(value = "/message", headers = "HEADER")
    public ResponseEntity<String> messageForHeader(@RequestHeader("HEADER") String header) {
        return ResponseEntity.ok().body(header);
    }
}