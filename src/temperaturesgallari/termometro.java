/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturesgallari;

/**
 *
 * @author Utente
 */
public class termometro {
private float tempMax=0, tempMin=0, temp_attuale=0, c=1;

public termometro() {
    temp_attuale=0;
    tempMax=temp_attuale;
    tempMin=temp_attuale;
}
public void setTemperatura(float temp){
    temp_attuale=temp;
    if(c==1){
        tempMax=temp;
        tempMin=temp;
    }else{
        if(temp>tempMax)
            tempMax=temp;
        else if(temp<tempMin)
            tempMin=temp;
        }
c=c+1;
    }
public float getTemperatura(){
    return temp_attuale;
}
public float getMin(){
    return tempMin;
}
public float getMax(){
    return tempMax;
}
}
