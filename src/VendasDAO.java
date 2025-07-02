import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VendasDAO {
    
    public void venderProduto(int produtoId, int quantidade) throws SQLException {
        String sql = "INSERT INTO vendas (produto_id, quantidade) VALUES (?, ?)";

        try (Connection conn = new conectaDAO().connectDB();
             PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setInt(1, produtoId);
            pstm.setInt(2, quantidade);

            pstm.executeUpdate();
        }
    }
    

    public ArrayList<VendasDTO> listarProdutosVendidos() throws SQLException {
        ArrayList<VendasDTO> listaVendidos = new ArrayList<>();
        
        String sql = "SELECT v.id, p.nome, v.quantidade, v.data_venda FROM vendas v JOIN produtos p ON v.produto_id = p.id";
        
        try (Connection conn = new conectaDAO().connectDB();
                PreparedStatement pstm = conn.prepareStatement(sql);
                ResultSet rs = pstm.executeQuery()) {
            
        while (rs.next()) {
            VendasDTO venda = new VendasDTO();
            venda.setId(rs.getInt("id"));
            venda.setNomeProduto(rs.getString("nome"));
            venda.setQuantidade(rs.getInt("quantidade"));
            venda.setDataVenda(rs.getTimestamp("data_venda").toLocalDateTime());

            listaVendidos.add(venda);
        }
        }

    return listaVendidos;
}
        }
    
    


