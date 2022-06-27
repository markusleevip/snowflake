# Snowflake generates  ID
The snowflake algorithm generates  ID

## Spring boot Demo
```java
@Controller
@RequestMapping(value="/demo")
@RequiredArgsConstructor
public class DemoController {

    private  final SnowflakeManager snowflakeManager;

    @GetMapping()
    public String Index() throws Exception {
        for (int i = 0; i < 10 ; i++) {
            long l = snowflakeManager.nextValue();
            System.out.println(l);
        }
        return "demo/index";
    }
}
```
## application.yml
```properties
mark:
    snowflake:
        machine-id: 1
        data-center-id: 1
```