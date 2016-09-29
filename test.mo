
package Compartments "Different types of compartments used in the package"

  partial model Compartment "Default compartment (constant volume)"
    annotation (Icon(coordinateSystem(preserveAspectRatio=true, extent={{-100,
                -100},{100,100}}), graphics={
            Text(
              extent={{-150,-120},{150,-180}},
              lineColor={0,0,255},
              textString="%name"),
            Rectangle(
              extent={{80,-80},{120,-120}},
              lineColor={192,192,192},
              fillColor={192,192,192},
              fillPattern=FillPattern.Solid),
            Line(
              visible=true,
              points={{80,-100},{120,-100}}),
            Line(
              visible=not useSupport,
              points={{90,-100},{80,-120}}),
            Line(
              visible=not useSupport,
              points={{100,-100},{90,-120}}),
            Line(
              visible=not useSupport,
              points={{110,-100},{100,-120}}),
            Line(
              visible=not useSupport,
              points={{120,-100},{110,-120}})}));
  equation
    der(V)=0 "Compartment volume is constant";
  end Compartment;



end Compartments;
