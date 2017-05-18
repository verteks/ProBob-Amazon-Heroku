
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
/**/
object textarea extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Field,String,Array[scala.Tuple2[Symbol, Any]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(field: Field, label: String, args: (Symbol,Any)*):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""
<div class="form-group"""),_display_(Seq[Any](/*2.24*/if(field.hasErrors)/*2.43*/{_display_(Seq[Any](format.raw/*2.44*/(""" has-error""")))})),format.raw/*2.55*/("""">
	<label for=""""),_display_(Seq[Any](/*3.15*/field/*3.20*/.name)),format.raw/*3.25*/("""" class="control-label">"""),_display_(Seq[Any](/*3.50*/label)),format.raw/*3.55*/("""</label>
	<textarea name=""""),_display_(Seq[Any](/*4.19*/field/*4.24*/.name)),format.raw/*4.29*/("""" id=""""),_display_(Seq[Any](/*4.36*/field/*4.41*/.name)),format.raw/*4.46*/("""" class="form-control" """),_display_(Seq[Any](/*4.70*/toHtmlArgs(args.toMap))),format.raw/*4.92*/(""">"""),_display_(Seq[Any](/*4.94*/field/*4.99*/.value)),format.raw/*4.105*/("""</textarea>
	"""),_display_(Seq[Any](/*5.3*/if(field.hasErrors)/*5.22*/ {_display_(Seq[Any](format.raw/*5.24*/("""
	<span class="help-block">Поле должно быть заполнено!</span>
	""")))})),format.raw/*7.3*/("""
</div>
"""))}
    }
    
    def render(field:Field,label:String,args:Array[scala.Tuple2[Symbol, Any]]): play.api.templates.HtmlFormat.Appendable = apply(field,label,args:_*)
    
    def f:((Field,String,Array[scala.Tuple2[Symbol, Any]]) => play.api.templates.HtmlFormat.Appendable) = (field,label,args) => apply(field,label,args:_*)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri May 19 01:01:31 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/aamazon-heroku/app/views/textarea.scala.html
                    HASH: de738a0319a134f7ee7c26a81a6373a6c749bb23
                    MATRIX: 816->1|960->51|1020->76|1047->95|1085->96|1127->107|1180->125|1193->130|1219->135|1279->160|1305->165|1368->193|1381->198|1407->203|1449->210|1462->215|1488->220|1547->244|1590->266|1627->268|1640->273|1668->279|1717->294|1744->313|1783->315|1879->381
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|33->5|33->5|33->5|35->7
                    -- GENERATED --
                */
            