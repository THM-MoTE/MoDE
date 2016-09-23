
package Compartments "Different types of compartments used in the package"
extends Icons.Library;
  model Compartment "Default compartment (constant volume)"
    annotation(Documentation(info="<html>
<h1>Compartment</h1>
 <p>
 Default compartment model.
 </p>
 </html>", revisions=""), Icon(coordinateSystem(extent={{-100,100},{100,-100}}, preserveAspectRatio=true, grid={10,10}), graphics={Text(fillColor={0,85,0}, fillPattern=FillPattern.Solid, extent={{-100,-170},{100,-120}}, textString="%name", fontName="Arial"),Rectangle(lineColor={0,85,0}, fillColor={199,199,149}, fillPattern=FillPattern.Solid, lineThickness=10, extent={{-110,-110},{110,110}}, radius=20)}), Diagram(coordinateSystem(extent={{-100,100},{100,-100}}, preserveAspectRatio=true, grid={10,10})));
    extends BioChem.Interfaces.Compartments.Compartment(V(stateSelect=StateSelect.prefer));
  equation
    der(V)=0 "Compartment volume is constant";
  end Compartment;

  model MainCompartment "Main compartment (constant volume)"
    annotation(Documentation(info="<html>
<h1>MainCompartment</h1>

 <p>
 Main compartment model.
 </p>
 </html>", revisions=""), Icon(coordinateSystem(extent={{-100,100},{100,-100}}, preserveAspectRatio=true, grid={10,10}), graphics={Text(fillColor={0,85,0}, fillPattern=FillPattern.Solid, extent={{-100,-170},{100,-120}}, textString="%name", fontName="Arial"),Rectangle(lineColor={0,85,0}, fillColor={199,199,149}, fillPattern=FillPattern.Solid, lineThickness=10, extent={{-110,-110},{110,110}}, radius=20),Text(fillPattern=FillPattern.Solid, extent={{-82.12,-80},{80,80}}, textString="main", fontName="Arial", textStyle={TextStyle.Bold})}), Diagram(coordinateSystem(extent={{-100,100},{100,-100}}, preserveAspectRatio=true, grid={10,10})));
    extends BioChem.Interfaces.Compartments.MainCompartment(V(stateSelect=StateSelect.prefer));
  equation
    der(V)=0 "Compartment volume is constant";
  end MainCompartment;

  annotation(
    Icon(coordinateSystem(extent={{-100,100},{100,-100}}, preserveAspectRatio=true, grid={10,10}), graphics={Rectangle(origin={5,-7.55952}, lineColor={0,85,0}, fillColor={199,199,149}, fillPattern=FillPattern.Solid, lineThickness=10, extent={{-70,-70},{40,30}}, radius=20)}),
    Diagram(coordinateSystem(extent={{-100,100},{100,-100}}, preserveAspectRatio=true, grid={10,10}))
  );

end Compartments;
