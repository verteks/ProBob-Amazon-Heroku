
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/* @(s3Files: List[models.S3File])   */
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /* @(s3Files: List[models.S3File])   */
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*4.6*/main("Upload")/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    <div class="uploadContainer">
    <h1 class="h1Center">Upload a file</h1>
    """),_display_(Seq[Any](/*7.6*/helper/*7.12*/.form(action = routes.Application.upload, 'enctype -> "multipart/form-data")/*7.88*/ {_display_(Seq[Any](format.raw/*7.90*/("""
        <input type="file" name="upload">
        <p> <h4>easy access <input type="checkbox" name ="easyAccessFile"> </h4></p>
        <input type="submit" class="btn btn-primary">
    """)))})),format.raw/*11.6*/("""
  </div>
 <div data-bind="uploadViewModel">
 """),format.raw/*20.7*/("""
     <div class="uploadsContainer">
             <h1 class="h1Center">Uploads</h1>
          <table class="table table-condensed" >
              <thead>
                <tr class="tableTopText">
                  <th>Name</th>
                  <th>Status</th>
                  <th></th>
                </tr>
              </thead>
            <tbody data-bind="foreach: files">
                <tr>
                    <td> <a data-bind="attr: """),format.raw/*33.46*/("""{"""),format.raw/*33.47*/(""" href: url"""),format.raw/*33.57*/("""}"""),format.raw/*33.58*/(""""><p data-bind="text: name"></p></a> </td>
                    <td>
                        <a href="#" data-bind="click: $root.changeEasyAccess, attr: """),format.raw/*35.85*/("""{"""),format.raw/*35.86*/(""" class: easyAccessClass"""),format.raw/*35.109*/("""}"""),format.raw/*35.110*/("""" style="width: 150px; height: 34px;"><p data-bind = "text: easyAccessText"></p></a>
                    </td>
                    <td>
                      <a href="#" data-bind="click: $root.removeFile"  class="btn btn-danger">Удалить</a>
                        """),format.raw/*39.118*/("""
                    </td>

                </tr>
            </tbody>
          </table>
     </div>
   """),format.raw/*62.13*/("""
 </div>
 <script language = "javascript" lang="javascript" src ='"""),_display_(Seq[Any](/*64.59*/routes/*64.65*/.Assets.at("javascripts/app.js"))),format.raw/*64.97*/("""'></script>
""")))})),format.raw/*65.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 26 21:55:14 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/index.scala.html
                    HASH: d902a7cce7cd5da5637e8b27e3cbd7554e4032e8
                    MATRIX: 934->50|956->64|995->66|1116->153|1130->159|1214->235|1253->237|1475->428|1551->630|2041->1092|2070->1093|2108->1103|2137->1104|2319->1258|2348->1259|2400->1282|2430->1283|2729->1646|2869->2715|2974->2784|2989->2790|3043->2822|3088->2836
                    LINES: 29->4|29->4|29->4|32->7|32->7|32->7|32->7|36->11|39->20|52->33|52->33|52->33|52->33|54->35|54->35|54->35|54->35|58->39|65->62|67->64|67->64|67->64|68->65
                    -- GENERATED --
                */
            