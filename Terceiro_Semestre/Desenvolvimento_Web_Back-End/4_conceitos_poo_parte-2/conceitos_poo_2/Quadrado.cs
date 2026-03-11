using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_2
{
    // Classe quadrada herdando de uma classe abstrata.
    public class Quadrado : Forma
    {
        public Quadrado(string cor) : base(cor){}

        public override double CalcularArea()
        {
            throw new NotImplementedException();
        }

        public override double CalcularPerimetro()
        {
            throw new NotImplementedException();
        }
    }
}