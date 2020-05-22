package SumService.entity;

public class StatusInfo {
    private Integer code;
    private String description;

    private Integer sum;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code){
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum){
        this.sum = sum;
    }

    public StatusInfo() {
    }

    public StatusInfo(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public StatusInfo(Integer sum, Integer code, String description) {
        this.sum = sum;
        this.code = code;
        this.description = description;
    }
}