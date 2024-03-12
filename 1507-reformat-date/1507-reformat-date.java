class Solution {
    public String reformatDate(String date) {
        StringBuilder sb = new StringBuilder();

        String[] dateParts = date.split(" ");
        String day = dateParts[0];
        String month = dateParts[1];
        String year = dateParts[2];
        
        sb.append(year);
        sb.append("-");
        
        switch(dateParts[1]){
            case "Jan":
                sb.append("01");
                break;
            case "Feb":
                sb.append("02");
                break;
            case "Mar":
                sb.append("03");
                break;
            case "Apr":
                sb.append("04");
                break;
            case "May":
                sb.append("05");
                break;
            case "Jun":
                sb.append("06");
                break;
            case "Jul":
                sb.append("07");
                break;
            case "Aug":
                sb.append("08");
                break;
            case "Sep":
                sb.append("09");
                break;
            case "Oct":
                sb.append("10");
                break;
            case "Nov":
                sb.append("11");
                break;
            case "Dec":
                sb.append("12");
                break;
            default:
                break;
        }
        
        sb.append("-");
        
        if(day.charAt(1)>='0' && day.charAt(1)<='9'){
            sb.append(day.charAt(0));
            sb.append(day.charAt(1));
        } else {
            sb.append("0");
            sb.append(day.charAt(0));
        } 
        
        return sb.toString();
    }
}