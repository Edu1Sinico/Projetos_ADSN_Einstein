using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Threading.Tasks;

namespace conceitos_poo_1
{
    public class Autor : Pessoa
    {
        public Autor()
        {
            Livros = new List<Livros>();
        }
        public List<Livros> Livros { get; set; }
        public void AdicionarLivro(Livros umLivro)
        {
            Livros.Add(umLivro);
        }
    }
}