
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
object input extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Field,String,Array[scala.Tuple2[Symbol, Any]],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(field: Field, label: String, args: (Symbol,Any)*):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.52*/("""
<div class=""""),_display_(Seq[Any](/*2.14*/if(field.hasErrors )/*2.34*/ {_display_(Seq[Any](format.raw/*2.36*/(""" has-error""")))})),format.raw/*2.47*/("""">
	<label for=""""),_display_(Seq[Any](/*3.15*/field/*3.20*/.name)),format.raw/*3.25*/("""" class="yoPi">"""),_display_(Seq[Any](/*3.41*/label)),format.raw/*3.46*/("""</label>
	<input name=""""),_display_(Seq[Any](/*4.16*/field/*4.21*/.name)),format.raw/*4.26*/("""" id=""""),_display_(Seq[Any](/*4.33*/field/*4.38*/.name)),format.raw/*4.43*/(""""  value=""""),_display_(Seq[Any](/*4.54*/field/*4.59*/.value)),format.raw/*4.65*/("""" """),_display_(Seq[Any](/*4.68*/toHtmlArgs(args.toMap))),format.raw/*4.90*/(""" />
	"""),_display_(Seq[Any](/*5.3*/if(field.hasErrors )/*5.23*/ {_display_(Seq[Any](format.raw/*5.25*/("""
	<span class="help-block">
		"""),_display_(Seq[Any](/*7.4*/field/*7.9*/.errors.head.message)),format.raw/*7.29*/("""
	</span>
	""")))})),format.raw/*9.3*/("""
</div>
"""))}
    }
    
    def render(field:Field,label:String,args:Array[scala.Tuple2[Symbol, Any]]): play.api.templates.HtmlFormat.Appendable = apply(field,label,args:_*)
    
    def f:((Field,String,Array[scala.Tuple2[Symbol, Any]]) => play.api.templates.HtmlFormat.Appendable) = (field,label,args) => apply(field,label,args:_*)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 26 21:55:14 IRKT 2017
                    SOURCE: C:/Users/vshir/Documents/play-2.2.6/ProBob-Amazon-Heroku/app/views/input.scala.html
                    HASH: b326e8a3c893aa7101f9c81926c52e7c7ad0b76f
                    MATRIX: 813->1|957->51|1007->66|1035->86|1074->88|1116->99|1169->117|1182->122|1208->127|1259->143|1285->148|1345->173|1358->178|1384->183|1426->190|1439->195|1465->200|1511->211|1524->216|1551->222|1589->225|1632->247|1673->254|1701->274|1740->276|1807->309|1819->314|1860->334|1904->348
                    LINES: 26->1|29->1|30->2|30->2|30->2|30->2|31->3|31->3|31->3|31->3|31->3|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|32->4|33->5|33->5|33->5|35->7|35->7|35->7|37->9
                    -- GENERATED --
                */
            