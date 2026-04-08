using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EinsteinGestaoAcademica.API.Dominio.Entidades
{
    public class Curso
    {
        public string NomeCurso { get; set; }
        public int CargaHoraria {get;set;}
        public decimal Valor{get;set;}
        public List<Disciplina> Disciplinas {get;set;}
    }
}