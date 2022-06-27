# Snowflake generates  ID
The snowflake algorithm generates  ID

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