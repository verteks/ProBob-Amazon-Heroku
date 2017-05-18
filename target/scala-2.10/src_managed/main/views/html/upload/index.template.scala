
package views.html.upload

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
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import bootstrap._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Uplode")/*3.16*/ {_display_(Seq[Any](format.raw/*3.18*/("""
    <div data-bind="uploadViewModel">

            <form action="https://s3-bucket.s3.amazonaws.com/" method="post" enctype="multipart/form-data">
                <input type="hidden" name="key" value="uploads/$"""),format.raw/*7.65*/("""{"""),format.raw/*7.66*/("""filename"""),format.raw/*7.74*/("""}"""),format.raw/*7.75*/("""">
                <input type="hidden" name="AWSAccessKeyId" value="YOUR_AWS_ACCESS_KEY">
                <input type="hidden" name="acl" value="private">
                <input type="hidden" name="success_action_redirect" value="http://localhost/">
                <input type="hidden" name="policy" value="YOUR_POLICY_DOCUMENT_BASE64_ENCODED">
                <input type="hidden" name="signature" value="YOUR_CALCULATED_SIGNATURE">
                <input type="hidden" name="Content-Type" value="image/jpeg">
                    <!-- Include any additional input fields here -->

                    File to upload to S3:
                <input name="file" type="file">
                <br>
                <input type="submit" value="Upload File to S3">
            </form>
        <p data-bind="s3Bucket"></p>>
    </div>


    <script language = "javascript" lang="javascript" src ='"""),_display_(Seq[Any](/*25.62*/routes/*25.68*/.Assets.at("javascripts/app.js"))),format.raw/*25.100*/("""'></script>

""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 19 01:01:31 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/aamazon-heroku/app/views/upload/index.scala.html
                    HASH: b7b7bc45546ae2cccb3376d43485346f5a5b56da
                    MATRIX: 882->21|919->24|941->38|980->40|1223->256|1251->257|1286->265|1314->266|2259->1175|2274->1181|2329->1213
                    LINES: 30->2|31->3|31->3|31->3|35->7|35->7|35->7|35->7|53->25|53->25|53->25
                    -- GENERATED --
                */
            