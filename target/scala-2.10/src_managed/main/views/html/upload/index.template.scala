
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template7[String,String,String,String,String,String,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(s3Bucket: String,accessKey : String,filename : String,acl: String,success_action_redirect: String,policy: String,signature: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import bootstrap._


Seq[Any](format.raw/*1.134*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Uplode")/*4.16*/ {_display_(Seq[Any](format.raw/*4.18*/("""
    <div data-bind="uploadViewModel">

            <form action="https://"""),_display_(Seq[Any](/*7.36*/s3Bucket)),format.raw/*7.44*/("""+.s3.amazonaws.com/" method="post" enctype="multipart/form-data">
                <input type="hidden" name="key" value=""""),_display_(Seq[Any](/*8.57*/filename)),format.raw/*8.65*/("""">
                <input type="hidden" name="AWSAccessKeyId" value="YOUR_AWS_ACCESS_KEY">
                <input type="hidden" name="acl" value=""""),_display_(Seq[Any](/*10.57*/acl)),format.raw/*10.60*/("""">
                <input type="hidden" name="success_action_redirect" value=""""),_display_(Seq[Any](/*11.77*/success_action_redirect)),format.raw/*11.100*/("""">
                <input type="hidden" name="policy" value=""""),_display_(Seq[Any](/*12.60*/policy)),format.raw/*12.66*/("""">
                <input type="hidden" name="signature" value=""""),_display_(Seq[Any](/*13.63*/signature)),format.raw/*13.72*/("""">
                <input type="hidden" name="Content-Type" value="">
                    File to upload to S3:
                <input name="file" type="file">
                <br>
                <input type="submit" value="Upload File to S3">
            </form>
        <p data-bind="s3Bucket"></p>>
    </div>


    <!--<script language = "javascript" lang="javascript" src ='"""),_display_(Seq[Any](/*24.66*/routes/*24.72*/.Assets.at("javascripts/app.js"))),format.raw/*24.104*/("""'></script>-->

""")))})))}
    }
    
    def render(s3Bucket:String,accessKey:String,filename:String,acl:String,success_action_redirect:String,policy:String,signature:String): play.api.templates.HtmlFormat.Appendable = apply(s3Bucket,accessKey,filename,acl,success_action_redirect,policy,signature)
    
    def f:((String,String,String,String,String,String,String) => play.api.templates.HtmlFormat.Appendable) = (s3Bucket,accessKey,filename,acl,success_action_redirect,policy,signature) => apply(s3Bucket,accessKey,filename,acl,success_action_redirect,policy,signature)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 19 12:20:32 IRKT 2017
                    SOURCE: C:/playHero/play-2.2.6/play-2.2.6/ProBob-Amazon-Heroku/app/views/upload/index.scala.html
                    HASH: 012210ff3d054394326bf897fd2b43ef6d982351
                    MATRIX: 823->1|1070->133|1098->156|1135->159|1157->173|1196->175|1309->253|1338->261|1496->384|1525->392|1710->541|1735->544|1851->624|1897->647|1996->710|2024->716|2126->782|2157->791|2585->1183|2600->1189|2655->1221
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|36->8|36->8|38->10|38->10|39->11|39->11|40->12|40->12|41->13|41->13|52->24|52->24|52->24
                    -- GENERATED --
                */
            