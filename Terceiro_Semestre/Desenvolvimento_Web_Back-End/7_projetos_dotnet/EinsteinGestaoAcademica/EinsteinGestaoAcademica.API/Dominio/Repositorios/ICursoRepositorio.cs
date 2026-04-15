using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace EinsteinGestaoAcademica.API.Dominio
{
    public interface ICursoRepositorio
    {
        void Inserir(Curso curso);
        void Atualizar(Curso curso);
        void Deletar(Curso curso);
        void ObterCurso(int id);
        List<Curso> ObterCurso();
    }
}