package petroncompany.areasyvolumenescalculadora;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    public EditText editText;
    public TextView textView,textView2,textView3,textView4,textView5;
    public Button button;

    public Fragment1() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vista = inflater.inflate(R.layout.fragment_fragment1, container, false);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragment1, container, false);


        editText = (EditText) vista.findViewById(R.id.editText_lado_cuadrado);
        textView = (TextView) vista.findViewById(R.id.editText_resultado_area_cuadrado);
        textView2 =(TextView) vista.findViewById(R.id.textView_perimetro_cuadrado);
        textView3 =(TextView) vista.findViewById(R.id.editText_resultado_perimetro);
        textView4 =(TextView) vista.findViewById(R.id.textView_diagonal_cuadrado);
        textView5 =(TextView) vista.findViewById(R.id.editText_resultado_diagonal);
        button = (Button) vista.findViewById(R.id.button_calcula_area_cuadrado);
        button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                String lado = editText.getText().toString();
                int valorlado = Integer.parseInt(lado);
                int resultado_area_cuadrado = valorlado * valorlado;
                int resultado_perimetro_cuadrado = valorlado * 4;
                double resultado_diagonal_cuadrado = Math.sqrt(2)*2;
                String resultado_area = String.valueOf(resultado_area_cuadrado);
                String resultado_perimetro = String.valueOf(resultado_perimetro_cuadrado);
                String resultado_diagonal = String.valueOf(resultado_diagonal_cuadrado);

                textView.setText(resultado_area);
                textView3.setText(resultado_perimetro);
                textView5.setText(resultado_diagonal);

            }
        });


        return vista;
    }
}


