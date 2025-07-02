import java.time.LocalDateTime;

public class VendasDTO {
     private int id;
    private String nomeProduto;
    private int quantidade;
    private LocalDateTime dataVenda;

    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNomeProduto() { return nomeProduto; }
    public void setNomeProduto(String nomeProduto) { this.nomeProduto = nomeProduto; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public LocalDateTime getDataVenda() { return dataVenda; }
    public void setDataVenda(LocalDateTime dataVenda) { this.dataVenda = dataVenda; }
}
