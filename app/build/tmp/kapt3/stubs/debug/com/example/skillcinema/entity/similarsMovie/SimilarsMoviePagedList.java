package com.example.skillcinema.entity.similarsMovie;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/skillcinema/entity/similarsMovie/SimilarsMoviePagedList;", "", "items", "", "Lcom/example/skillcinema/entity/similarsMovie/SimilarsMovie;", "getItems", "()Ljava/util/List;", "total", "", "getTotal", "()I", "app_debug"})
public abstract interface SimilarsMoviePagedList {
    
    public abstract int getTotal();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.skillcinema.entity.similarsMovie.SimilarsMovie> getItems();
}