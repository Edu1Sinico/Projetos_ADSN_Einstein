using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace conceitos_poo_2
{
    public class Animal
    {
        public virtual void EmitirSom()
        {
            Console.WriteLine("Som genérico de um animal");
        }        
    }
}