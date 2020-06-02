package cn.sensor.domain;

public class JudgeMessage {
     String heartRate;
     String bloodOxygen;
     String temprature;

    public String judgeheartRate(Message msg){
        if(msg.getHeartrate()<150 &&  msg.getHeartrate()>50){
            heartRate="您的心率为"+msg.getHeartrate()+"，心率正常，请继续保持哦...\n" ;
        }
        else{
            heartRate="您的心率为"+msg.getHeartrate()+"，建议您加强锻炼或去医院咨询医生...\n";
        }
        return heartRate;
    }

    public String judgeBloodOxygen(Message msg){
        if(msg.getBloodoxygen()<230 &&  msg.getBloodoxygen()>150){
            bloodOxygen="您的血氧为"+msg.getBloodoxygen()+"，正常，平时可适当进行锻炼哦...\n" ;
        }
        else{
            bloodOxygen="您的血氧为"+msg.getBloodoxygen()+"，建议您及时去医院咨询...\n";
        }
        return  bloodOxygen;
    }

    public String judgeTemprature(Message msg){
        if(msg.getTemperature()<37.5 &&  msg.getTemperature()>36.4){
            temprature="您的体温为"+msg.getTemperature()+"，体温正常...\n" ;
        }
        else{
            temprature="您的体温为"+msg.getTemperature()+"，发烧，建议即使就诊...\n";
        }
        return  temprature;
    }

    public String getAllSuggestion(Message msg){
        if(msg.getHeartrate()<150 &&  msg.getHeartrate()>50){
            heartRate="您的心率为"+msg.getHeartrate()+"，心率正常，请继续保持哦...\n" ;
        }
        else{
            heartRate="您的心率为"+msg.getHeartrate()+"，建议您加强锻炼或去医院咨询医生...\n";
        }
        if(msg.getBloodoxygen()<230 &&  msg.getBloodoxygen()>150){
            bloodOxygen="您的血氧为"+msg.getBloodoxygen()+"，正常，平时可适当进行锻炼哦...\n" ;
        }
        else{
            bloodOxygen="您的血氧为"+msg.getBloodoxygen()+"，建议您及时去医院咨询...\n";
        }
        if(msg.getTemperature()<37.5 &&  msg.getTemperature()>36.4){
            temprature="您的体温为"+msg.getTemperature()+"，体温正常...\n" ;
        }
        else{
            temprature="您的体温为"+msg.getTemperature()+"，发烧，建议即使就诊...\n";
        }
        return heartRate+bloodOxygen+temprature;
    }
}
