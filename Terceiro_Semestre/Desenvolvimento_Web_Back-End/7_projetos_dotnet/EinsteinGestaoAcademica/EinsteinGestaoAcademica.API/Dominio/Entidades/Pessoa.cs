using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EinsteinGestaoAcademica.API.Dominio.Entidades
{
    public class Pessoa
    {
        public string Nome { get; set; }
        public string CPF { get; set; }
        public string Telefone { get; set; }
        public string Cidade { get; set; }
        public string Estado { get; set; }
    }
}