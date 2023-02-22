@PostMapping(value = "/message")
public FeishuEventDTO message(@RequestBody String body) {
  log.info("收到消息：{}", body);
  FeishuEventParams feishuEventParams = JSON.parseObject(body, FeishuEventParams.class);
  FeishuEventDTO eventDTO = new FeishuEventDTO();
  eventDTO.setChallenge(feishuEventParams.getChallenge());
  return eventDTO;
}

@Data
public class FeishuEventParams {

    private String challenge;
    private String token;
    private String type;
}

@Data
public class FeishuEventDTO {
    private String challenge;
}