package ru.yandex.practicum.catsgram.controller;

//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
//import ru.yandex.practicum.catsgram.exception.ParameterNotValidException;
import ru.yandex.practicum.catsgram.model.Post;
import ru.yandex.practicum.catsgram.service.PostService;
//import ru.yandex.practicum.catsgram.service.SortOrder;
//
//import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

//    @GetMapping
//    public Collection<Post> findAll(
//            @RequestParam(defaultValue = "desc") String sort,
//            @RequestParam(defaultValue = "0") String from,
//            @RequestParam(defaultValue = "10") String size
//    ) {
//        if (SortOrder.from(sort) == null) {
//            throw new ParameterNotValidException(
//                    "sort",
//                    "Некорректное значение сортировки. Используйте asc или desc");
//        }
//        if (Integer.parseInt(size) < 1) {
//            throw new ParameterNotValidException(
//                    "size",
//                    "Некорректный размер выборки. Размер должен быть больше нуля"
//            );
//        }
//
//        if (Integer.parseInt(from) < 0) {
//            throw new ParameterNotValidException(
//                    "from",
//                    "Параметр from не может быть меньше нуля."
//            );
//        }
//        return postService.findAll(Integer.parseInt(size), sort, Integer.parseInt(from));
//    }
//
    @GetMapping("/{postId}")
    public Optional<Post> findPostById(@PathVariable long postId) {
        return postService.findPostById(postId);
    }
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public Post create(@RequestBody Post post) {
//        return postService.create(post);
//    }
//
//
//    @PutMapping
//    public Post update(@RequestBody Post newPost) {
//        return postService.update(newPost);
//    }
}