package com.graduation.tool;

import com.graduation.bean.ForumAnswer;
import com.graduation.bean.ForumQuestion;
import com.graduation.bean.News;

import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Tool {
    public String getNowTime(){
        //得到当前时间毫秒值
        Calendar rightNow = Calendar.getInstance();
        //转成String型
        String time = rightNow.getTimeInMillis()+"";
        return time;
    }

    public String toTime(String time){
        Double tmv = Double.parseDouble(time);
        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");

        return sdf.format(tmv);
    }

    public List<ForumQuestion> changeQuestionListTime(List<ForumQuestion> questionList){
        for (ForumQuestion question:questionList) {
            question.setTime(toTime(question.getTime()));
        }
        return questionList;
    }

    public List<ForumAnswer> changeAnswerListTime(List<ForumAnswer> answerList){
        for (ForumAnswer answer:answerList) {
            answer.setTime(toTime(answer.getTime()));
        }
        return answerList;
    }

    public static void uploadFile(byte[] file, String filePath, String fileName) throws Exception {
        File targetFile = new File(filePath);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }

    public List<News> changeNewsListTime(List<News> newsList){
        for(News news:newsList){
            news.setTime(toTime(news.getTime()));
        }
        return newsList;
    }
}
