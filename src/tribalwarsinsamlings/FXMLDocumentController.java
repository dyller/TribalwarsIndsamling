/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tribalwarsinsamlings;

import java.io.File;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

/**
 *
 * @author jacob
 */
public class FXMLDocumentController implements Initializable {
DecimalFormat df = new DecimalFormat("####0.00");
    @FXML
    private Label label;
    @FXML
    private TextField spyd;
    @FXML
    private TextField sværd;
    @FXML
    private TextField økse;
    @FXML
    private TextField lk;
    @FXML
    private TextField tk;
    @FXML
    private Button beregn;
     public ObservableList<String> allFiles
            = FXCollections.observableArrayList();
    @FXML
    private ListView<String> udregning;
    @FXML
    private TextField lvl;
    
    double a = 0, b = 0, c = 0, d = 0;
    double contera =0, conterb =0, conterc=0,conterd=0;
    double spydman = 0;
    @FXML
    TextField speedfac ;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        spyd.setText("0");
        sværd.setText("0");
        økse.setText("0");
        lk.setText("0");
        tk.setText("0");
        lvl.setText("4");
        speedfac.setText("0.7237692407");
        // TODO
        udregning.setItems(allFiles);
    }
    double speedfact;
    @FXML
    private void beregn(ActionEvent event) {
     berg();
       
 }
void berg()
{
 conterb=0;
        contera=0;
        conterc=0;
        conterd=0;   
        allFiles.clear();
        try {
         speedfact =   Double.parseDouble(speedfac.getText());
        int level = Integer.parseInt(lvl.getText());
        double spydantal = Integer.parseInt(spyd.getText())*1;
        double sværdpydantal = Integer.parseInt(sværd.getText())/1.667;
        double økseantal = Integer.parseInt(økse.getText())/2.5;
        double lkantal = Integer.parseInt(lk.getText())/0.3125;
        double tkantal = Integer.parseInt(tk.getText())*2;
        spydman= spydantal+sværdpydantal+økseantal+lkantal+tkantal;
      
        
        
         for (int i = 0; i < spydman ; i++) {

                  d  =(25*(conterd+1)*0.75)/((Math.pow((Math.pow((0.75*(conterd+1)*25), 2)*100), 0.45)+1800)*speedfact)
                         -(25*conterd*0.75)/((Math.pow((Math.pow((0.75*(conterd)*25), 2)*100), 0.45)+1800)*speedfact);
                
                 b  =(25*(conterb+1)*0.25)/((Math.pow((Math.pow((0.25*(conterb+1)*25), 2)*100), 0.45)+1800)*speedfact)-
                        (25*conterb*0.25)/((Math.pow((Math.pow((0.25*(conterb*25)), 2)*100), 0.45)+1800)*speedfact) ;
                 a  =(25*(contera+1)*0.1)/((Math.pow((Math.pow((0.1*(contera+1)*25), 2)*100), 0.45)+1800)*speedfact)
                         -(25*contera*0.1)/((Math.pow((Math.pow((0.1*(contera)*25), 2)*100), 0.45)+1800)*speedfact);
                 c  =(25*(conterc+1)*0.5)/((Math.pow((Math.pow((0.5*(conterc+1)*25), 2)*100), 0.45)+1800)*speedfact)
                         -(25*conterc*0.5)/((Math.pow((Math.pow((0.5*(conterc)*25), 2)*100), 0.45)+1800)*speedfact);
              if(level==4){
               if (d>c)
                {
                    conterd++;
                
                }
                else if (c>b)
                {
                    conterc++;
                
                }
                else if ( b>a)
                {
                conterb++;
                }
                else
                {
                    contera++;
                }
              }
              else if (level==3)
              {
                  if (c>b)
                {
                    conterc++;
                
                }
                else if ( b>a)
                {
                conterb++;
                }
                else
                {
                    contera++;
                }
              }
               else if (level==2)
              {
                 
                 if ( b>a)
                {
                conterb++;
                }
                else
                {
                    contera++;
                }
              }
              if (level == 1)
              {
              contera++;
              }
                  
            }
           d  =(25*(conterd+1)*0.75)/((Math.pow((Math.pow((0.75*(conterd+1)*25), 2)*100), 0.45)+1800)*speedfact)
                         -(25*conterd*0.75)/((Math.pow((Math.pow((0.75*(conterd)*25), 2)*100), 0.45)+1800)*speedfact);
                
                 b  =(25*(conterb+1)*0.25)/((Math.pow((Math.pow((0.25*(conterb+1)*25), 2)*100), 0.45)+1800)*speedfact)-
                        (25*conterb*0.25)/((Math.pow((Math.pow((0.25*(conterb*25)), 2)*100), 0.45)+1800)*speedfact) ;
                 a  =(25*(contera+1)*0.1)/((Math.pow((Math.pow((0.1*(contera+1)*25), 2)*100), 0.45)+1800)*speedfact)
                         -(25*contera*0.1)/((Math.pow((Math.pow((0.1*(contera)*25), 2)*100), 0.45)+1800)*speedfact);
                 c  =(25*(conterc+1)*0.5)/((Math.pow((Math.pow((0.5*(conterc+1)*25), 2)*100), 0.45)+1800)*speedfact)
                         -(25*conterc*0.5)/((Math.pow((Math.pow((0.5*(conterc)*25), 2)*100), 0.45)+1800)*speedfact);
                 
                 
                     double  dall  =(25*conterd*0.75)/((Math.pow((Math.pow((0.75*(conterd)*25), 2)*100), 0.45)+1800)*speedfact);
                
                 double ball  =(25*conterb*0.25)/((Math.pow((Math.pow((0.25*(conterb*25)), 2)*100), 0.45)+1800)*speedfact) ;
                  double aall =(25*contera*0.1)/((Math.pow((Math.pow((0.1*(contera)*25), 2)*100), 0.45)+1800)*speedfact);
                double call  =(25*conterc*0.5)/((Math.pow((Math.pow((0.5*(conterc)*25), 2)*100), 0.45)+1800)*speedfact);
                 
            allFiles.add("Første(10%). ress/t for næste spyd"+df.format(a*3600)+"\tAntal spyd(25resscap)*"+contera+"\tress/t:"+df.format(aall*3600));
            allFiles.add("Første(25%). ress/t for næste spyd"+df.format(b*3600)+"\tAntal spyd(25resscap)*"+conterb+"\tress/t:"+df.format(ball*3600));
         allFiles.add("Første(50%). ress/t for næste spyd"+df.format(c*3600)+"\tAntal spyd(25resscap)*"+conterc+"\tress/t:"+df.format(call*3600));
            allFiles.add("Første(75%). ress/t for næste spyd"+df.format(d*3600)+"\tAntal spyd(25resscap)*"+conterd+"\tress/t:"+df.format(dall*3600));
          }
        catch(NumberFormatException  e)
                {
                    alert("ParseError","alle felter skal udfyldes. Der må kun bruges tal" );
                }
     
}
    @FXML
    private void enter(KeyEvent event) {
         if(event.getCode() == KeyCode.ENTER)
        {
           berg();
        }
    }
    void alert(String title, String Content)
    {
 Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setContentText(Content);
        alert.showAndWait();
    }

}


