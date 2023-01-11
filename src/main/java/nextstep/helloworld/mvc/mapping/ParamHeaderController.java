package nextstep.helloworld.mvc.mapping;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> message() {
        return ResponseEntity.ok().body("message");
    }

    @GetMapping(value = "/message", params = "name")
    public ResponseEntity<String> messageForParam(@RequestParam(value = "name") String name) {
        return ResponseEntity.ok().body(name);
    }

    @GetMapping(value = "/message", headers = "HEADER")
    public ResponseEntity<String> messageForHeader(@RequestHeader(value = "HEADER") String msg) {
        return ResponseEntity.ok().body(msg);
    }
}